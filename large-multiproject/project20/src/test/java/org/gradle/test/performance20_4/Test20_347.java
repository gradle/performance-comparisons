package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_347 {
    private final Production20_347 production = new Production20_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}