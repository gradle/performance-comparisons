package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_229 {
    private final Production78_229 production = new Production78_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}