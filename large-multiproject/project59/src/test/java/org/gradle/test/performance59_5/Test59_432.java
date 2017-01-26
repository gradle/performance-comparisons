package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_432 {
    private final Production59_432 production = new Production59_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}