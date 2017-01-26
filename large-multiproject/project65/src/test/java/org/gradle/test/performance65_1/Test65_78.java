package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_78 {
    private final Production65_78 production = new Production65_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}