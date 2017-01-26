package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_234 {
    private final Production24_234 production = new Production24_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}