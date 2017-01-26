package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_157 {
    private final Production43_157 production = new Production43_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}