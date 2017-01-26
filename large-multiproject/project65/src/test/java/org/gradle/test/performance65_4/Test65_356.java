package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_356 {
    private final Production65_356 production = new Production65_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}