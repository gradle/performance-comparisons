package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_58 {
    private final Production43_58 production = new Production43_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}