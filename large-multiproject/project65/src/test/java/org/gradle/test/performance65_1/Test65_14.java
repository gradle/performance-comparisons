package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_14 {
    private final Production65_14 production = new Production65_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}