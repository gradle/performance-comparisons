package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_76 {
    private final Production59_76 production = new Production59_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}