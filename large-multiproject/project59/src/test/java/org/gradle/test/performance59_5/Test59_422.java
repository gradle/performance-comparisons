package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_422 {
    private final Production59_422 production = new Production59_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}