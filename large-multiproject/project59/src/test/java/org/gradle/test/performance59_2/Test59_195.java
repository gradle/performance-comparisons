package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_195 {
    private final Production59_195 production = new Production59_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}