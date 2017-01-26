package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_325 {
    private final Production65_325 production = new Production65_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}