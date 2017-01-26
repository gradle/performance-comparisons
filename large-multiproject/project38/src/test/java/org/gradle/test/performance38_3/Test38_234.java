package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_234 {
    private final Production38_234 production = new Production38_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}