package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_98 {
    private final Production59_98 production = new Production59_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}