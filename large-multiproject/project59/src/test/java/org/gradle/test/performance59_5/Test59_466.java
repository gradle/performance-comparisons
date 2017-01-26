package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_466 {
    private final Production59_466 production = new Production59_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}