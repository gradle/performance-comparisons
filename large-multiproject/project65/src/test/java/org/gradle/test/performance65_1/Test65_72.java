package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_72 {
    private final Production65_72 production = new Production65_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}