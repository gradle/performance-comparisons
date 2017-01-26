package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_325 {
    private final Production59_325 production = new Production59_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}