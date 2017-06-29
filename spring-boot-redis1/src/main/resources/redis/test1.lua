local result = redis.call('SETNX', KEYS[1], ARGV[1])

if tonumber(result) == 1 then
redis.call('EXPIRE', KEYS[1], ARGV[2])
end
return tostring(result)