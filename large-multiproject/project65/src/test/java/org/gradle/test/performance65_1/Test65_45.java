package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_45 {
    private final Production65_45 production = new Production65_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}