package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_353 {
    private final Production72_353 production = new Production72_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}