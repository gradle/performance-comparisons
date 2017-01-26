package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_347 {
    private final Production65_347 production = new Production65_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}