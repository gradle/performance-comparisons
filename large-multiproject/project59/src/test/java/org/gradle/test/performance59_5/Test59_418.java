package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_418 {
    private final Production59_418 production = new Production59_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}