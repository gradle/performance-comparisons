package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_289 {
    private final Production59_289 production = new Production59_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}