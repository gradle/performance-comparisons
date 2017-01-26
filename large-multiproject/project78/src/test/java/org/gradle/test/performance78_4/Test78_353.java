package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_353 {
    private final Production78_353 production = new Production78_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}