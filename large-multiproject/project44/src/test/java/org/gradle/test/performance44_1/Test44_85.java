package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_85 {
    private final Production44_85 production = new Production44_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}