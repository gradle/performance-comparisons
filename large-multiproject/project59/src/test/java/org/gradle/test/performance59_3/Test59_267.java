package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_267 {
    private final Production59_267 production = new Production59_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}