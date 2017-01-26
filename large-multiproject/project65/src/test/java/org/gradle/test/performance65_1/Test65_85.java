package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_85 {
    private final Production65_85 production = new Production65_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}