package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_49 {
    private final Production65_49 production = new Production65_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}