package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_3 {
    private final Production65_3 production = new Production65_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}