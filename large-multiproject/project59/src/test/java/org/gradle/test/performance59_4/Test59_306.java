package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_306 {
    private final Production59_306 production = new Production59_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}