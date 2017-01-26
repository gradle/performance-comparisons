package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_77 {
    private final Production59_77 production = new Production59_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}