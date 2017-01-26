package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_85 {
    private final Production1_85 production = new Production1_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}