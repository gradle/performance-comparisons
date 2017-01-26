package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_267 {
    private final Production43_267 production = new Production43_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}