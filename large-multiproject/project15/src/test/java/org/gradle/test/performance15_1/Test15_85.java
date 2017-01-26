package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_85 {
    private final Production15_85 production = new Production15_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}