package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_157 {
    private final Production59_157 production = new Production59_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}