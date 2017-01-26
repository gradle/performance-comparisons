package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_239 {
    private final Production78_239 production = new Production78_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}