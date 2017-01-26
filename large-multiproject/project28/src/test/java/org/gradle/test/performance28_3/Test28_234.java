package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_234 {
    private final Production28_234 production = new Production28_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}