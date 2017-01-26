package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_45 {
    private final Production59_45 production = new Production59_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}