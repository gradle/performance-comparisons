package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_338 {
    private final Production59_338 production = new Production59_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}