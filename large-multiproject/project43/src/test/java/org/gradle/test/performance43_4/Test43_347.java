package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_347 {
    private final Production43_347 production = new Production43_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}