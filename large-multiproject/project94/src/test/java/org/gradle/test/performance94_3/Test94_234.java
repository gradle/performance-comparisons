package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_234 {
    private final Production94_234 production = new Production94_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}