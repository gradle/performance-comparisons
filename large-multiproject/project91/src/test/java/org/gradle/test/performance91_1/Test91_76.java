package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_76 {
    private final Production91_76 production = new Production91_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}