package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_234 {
    private final Production83_234 production = new Production83_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}