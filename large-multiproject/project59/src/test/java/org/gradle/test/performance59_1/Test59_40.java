package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_40 {
    private final Production59_40 production = new Production59_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}