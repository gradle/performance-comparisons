package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_330 {
    private final Production59_330 production = new Production59_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}