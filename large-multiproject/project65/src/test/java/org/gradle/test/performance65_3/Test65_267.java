package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_267 {
    private final Production65_267 production = new Production65_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}