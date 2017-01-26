package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_85 {
    private final Production49_85 production = new Production49_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}