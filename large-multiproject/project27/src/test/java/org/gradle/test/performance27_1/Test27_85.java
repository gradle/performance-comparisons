package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_85 {
    private final Production27_85 production = new Production27_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}