package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_76 {
    private final Production19_76 production = new Production19_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}