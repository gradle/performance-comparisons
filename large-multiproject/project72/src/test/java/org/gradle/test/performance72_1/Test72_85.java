package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_85 {
    private final Production72_85 production = new Production72_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}