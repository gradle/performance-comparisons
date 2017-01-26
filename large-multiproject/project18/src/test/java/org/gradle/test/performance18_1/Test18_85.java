package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_85 {
    private final Production18_85 production = new Production18_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}