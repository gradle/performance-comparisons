package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_234 {
    private final Production46_234 production = new Production46_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}