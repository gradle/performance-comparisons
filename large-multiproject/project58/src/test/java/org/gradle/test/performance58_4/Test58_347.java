package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_347 {
    private final Production58_347 production = new Production58_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}