package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_97 {
    private final Production59_97 production = new Production59_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}