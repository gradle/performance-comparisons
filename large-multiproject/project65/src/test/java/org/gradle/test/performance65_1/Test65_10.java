package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_10 {
    private final Production65_10 production = new Production65_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}