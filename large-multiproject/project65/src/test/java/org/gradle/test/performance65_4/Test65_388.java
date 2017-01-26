package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_388 {
    private final Production65_388 production = new Production65_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}